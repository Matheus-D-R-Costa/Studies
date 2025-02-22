use std::mem::ManuallyDrop;
use std::ptr;

#[repr(C)]
union NodeData<T: Copy> {
    both: ManuallyDrop<(T, *mut Node<T>)>,
}

struct Node<T: Copy> {
    data: NodeData<T>,
}

impl<T: Copy> Node<T> {
    fn new(val: T, next: *mut Node<T>) -> Box<Self> {
        Box::new(Node {
            data: NodeData {
                both: ManuallyDrop::new((val, next)),
            },
        })
    }

    unsafe fn get_value(&self) -> T {
        let (val, _) = *self.data.both;
        val
    }

    unsafe fn get_next(&self) -> *mut Node<T> {
        let (_, next) = *self.data.both;
        next
    }

}

pub struct ConsList<T: Copy> {
    head: *mut Node<T>,
}

impl<T: Copy> ConsList<T> {
    pub fn new() -> Self {
        ConsList {
            head: ptr::null_mut(),
        }
    }
    
    pub fn push(&mut self, val: T) {
        let new_node = Node::new(val, self.head);
        let new_node_ptr = Box::into_raw(new_node);
        self.head = new_node_ptr;
    }
    
    pub fn iter(&self) -> ListIter<T> {
        ListIter {
            current: self.head,
        }
    }
}

pub struct ListIter<T: Copy> {
    current: *mut Node<T>,
}

impl<T: Copy> Iterator for ListIter<T> {
    type Item = T;
    
    fn next(&mut self) -> Option<Self::Item> {
        unsafe {
            if self.current.is_null() {
                None
            } else {
                let node = &*self.current;
                let val = node.get_value();
                self.current = node.get_next();
                Some(val)
            }
        }
    }
}

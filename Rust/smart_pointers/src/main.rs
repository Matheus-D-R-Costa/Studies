#![allow(dead_code)]
#![allow(non_snake_case)]

use std::mem::ManuallyDrop;

union ConsUnion<T> {
    value: ManuallyDrop<T>,
    next: *mut ConsUnion<T>
}

struct ConsList<T> {
    head: *mut ConsUnion<T>
}

fn main() {
    let node1 = Box::new(ConsUnion { value: ManuallyDrop::new(1)});
    let node2 = Box::new(ConsUnion { value: ManuallyDrop::new(2)});

    let node1_ptr = Box::into_raw(node1);
    let node2_ptr = Box::into_raw(node2);

    unsafe {
        (*node1_ptr).next = node2_ptr;
    }

}


use std::slice;

static mut COUNTER: u32 = 0;

// Uma diferença sutil entre constantes e variáveis ​​estáticas imutáveis ​​é que valores em uma variável estática têm um endereço fixo na memória. Usar o valor sempre acessará os mesmos dados. Constantes, por outro lado, podem duplicar seus dados sempre que forem usadas
unsafe fn add_to_count(inc: u32) {
    unsafe { COUNTER += inc ;}
}

#[unsafe(no_mangle)]
pub extern "C" fn call_from_c() {
    println!("Just called a Rust function from C!");
}

fn _split_at_mut(values: &mut [i32], mid: usize) -> (&mut [i32], &mut [i32]) {
    let len = values.len();
    let ptr = values.as_mut_ptr();

    assert!(mid <= len);

    unsafe {
        (
            slice::from_raw_parts_mut(ptr, len),
            slice::from_raw_parts_mut(ptr.add(mid), len - mid),
        )
    }
}

unsafe extern "C" {
    safe fn abs(input: i32) -> i32;
}

fn main() {
    let mut num: u8 = 5;

    let r1 = &raw const num;
    let r2 = &raw mut num;

    unsafe {
        println!("r1 is: {}", *r1);
        println!("r2 is: {}", *r2);
    }

    let mut v = vec![1, 2, 3, 4, 5, 6];

    let r = &mut v[..];

    let (a, b) = r.split_at_mut(3);

    assert_eq!(a, &mut [1, 2, 3]);
    assert_eq!(b, &mut [4, 5, 6]);

    // let address = 0x012345usize;
    // let addr = address as *const i32;

    // let values = unsafe { slice::from_raw_parts_mut(r, 10000) };

    println!("Absolute value of -3 according to C: {}", abs(-3));

    unsafe {
        add_to_count(5);
        println!("COUNTER: {}", *(&raw const COUNTER));
    }
}

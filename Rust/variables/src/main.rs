fn main() {

let imc = calculate_imc(106.0, 182.0);

define_imc(imc);

}

fn calculate_imc(weight:f32, height: f32) -> f32 {
   let imc = weight/(height/100.0 * height/100.0);
    imc
}

fn define_imc(imc: f32) {
    if imc < 18.5 {
        println!("Baixo peso.")
    } else if imc > 18.5 && imc < 24.99 {
        println!("Normal.")
    } else if imc > 24.99 && imc < 29.99 {
        println!("Sobrepeso.")
    } else {
        println!("Obesidade.")
    }
}
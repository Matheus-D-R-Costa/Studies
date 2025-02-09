fn calculate_imc(weight: f32, height: f32) -> f32 {
    return weight/(height/100.0 * height/100.0);
}

fn get_imc(weight: f32, height: f32) {
    let imc: f32 = calculate_imc(weight, height);
    if imc < 18.5 {
        println!("Baixo peso.");
    } else if imc > 18.5 && imc < 24.99 {
        println!("Normal.");
    } else if imc > 24.99 && imc < 24.99 {
        println!("Sobrepeso.");
    } else {
        println!("Obesidade.");
    }
}

fn main() {
    get_imc(98.4, 183.0);

    let condition: bool = true;
    let number = if condition { 5 } else { 6 };
    println!("The value of number is {number}");

}

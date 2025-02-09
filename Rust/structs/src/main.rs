struct User {
    active: bool,
    username: String,
    email: String,
    sign_in_count: u64,
}

impl User {
    fn new(username: String, email: String) -> User {
        User {
            active: true,
            username,
            email,
            sign_in_count: 0,
        }
    }

    fn iter(&self) -> impl Iterator<Item = &dyn std::fmt::Debug> {
        [
            &self.active as &dyn ::std::fmt::Debug,
            &self.username as &dyn std::fmt::Debug,
            &self.email as &dyn std::fmt::Debug,
            &self.sign_in_count as &dyn std::fmt::Debug,
        ]
        .into_iter()
    }
}

struct Color(i32, i32, i32);
struct Point(i32, i32, i32);

fn main() {
    let mut user1 = User {
        active: true,
        username: String::from("someusername123"),
        email: String::from("someone@example.com"),
        sign_in_count: 1,
    };

    user1.email = String::from("another@gmail.com");
    for field in user1.iter() {
        println!("{:?}", field);
    }

    let user2 = User {
        active: user1.active,
        username: user1.username,
        email: String::from("user2@usr.com"),
        sign_in_count: user1.sign_in_count,
    };

    for field in user2.iter() {
        println!("{:?}", field);
    }

    let user3 = User {
        email: String::from("user3@senac.com"),
        ..user2
    };

    for field in user3.iter() {
        println!("{:?}", field);
    }

    let user4 = User::new(String::from("User123"), String::from("horseman@stable.com"));
    for field in user4.iter() {
        println!("{:?}", field);
    }

    let black = Color(0, 0, 0);
    println!("black equals = {}, {}, {},", black.0, black.1, black.2);

    let origin = Point(0, 0, 0);
    println!("origin equals = {}, {}, {},", origin.0, origin.1, origin.2);
}

package chapter06

object Test16_TraitSelfType {
    def main(args: Array[String]): Unit = {
        val tzkUser = new RegisterUser("tzk", "123456")
        tzkUser.insert
    }
}

class User(val name: String, val password: String)

trait UserDao {
    _: User =>
    def insert = println(s"insert into db: ${this.name}")
}

class RegisterUser(name: String, password: String) extends User(name, password) with UserDao

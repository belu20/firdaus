//latihan
fun  main(){
    print("masukan nilai a:")
    val a = readLine()?.toInt()
    print("masukan nilai b:")
    val b = readLine()?.toInt()
    val kali = a!! * b!!
    val tambah = a!! + b!!
    val pembagian = a!! / b!!
    val modulus = a!! % b!!
    val pengurangan = a - b


    println("hasil kali = $kali ")
    println("hasil tambah = $tambah")
    println("hasil modulus = $modulus")
    println("hasil pembagian =$pembagian ")
    println("hasil pengurangan =$pengurangan")

}
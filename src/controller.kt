 class Controller () {
        val pil = mutableListOf<String>("gunting","batu","kertas")
        var hasil = ""

        fun pilihansatu(listener: CallBack) {
            println("1. Input Pemain 1 : ")
            var pemain1 = readLine()!!.toLowerCase()
            println("2. Input Pemain 2 : ")
            var pemain2 = readLine()!!.toLowerCase()
            println("Hasil : ")

            if (pemain1 == "gunting" && pemain2 == "kertas" || pemain1 == "batu" && pemain2 == "gunting" ||
                pemain1 == "kertas" && pemain2 == "batu") {
                hasil = "Pemain Satu Menang"
            } else if (pemain1 == "kertas" && pemain2 == "gunting" || pemain1 == "gunting" && pemain2 == "batu" ||
                pemain1 == "batu" && pemain2 == "kertas") {
                hasil = "Pemain Satu Kalah"
            } else if (pemain1 == "kertas" && pemain2 == "kertas" || pemain1 == "gunting" && pemain2 == "gunting" ||
                pemain1 == "batu" && pemain2 == "batu") {
                hasil = "DRAW BROO"
            } else {
                hasil = "Input Salah"
            }
            listener.tampilkanHasil(hasil)
        }
        fun pilihandua(listener: CallBack) {
            println("1. Masukkan Pemain 1 : ")
            var pemain1 = readLine()!!.toLowerCase()
            var computer = pil.random()
            println("Computer Menggunakan : $computer")

            if (pemain1 == "gunting" && computer == "kertas" || pemain1 == "batu" && computer == "gunting" ||
                pemain1 == "kertas" && computer == "batu") {
                hasil = "Pemain Satu Menang"
            } else if (pemain1 == "kertas" && computer == "gunting" || pemain1 == "gunting" && computer == "batu" ||
                pemain1 == "batu" && computer == "kertas") {
                hasil ="Pemain Satu Kalah"
            } else if (pemain1 == "kertas" && computer == "kertas" || pemain1 == "gunting" && computer == "gunting" ||
                pemain1 == "batu" && computer == "batu") {
                hasil = "DRAW BROO"
            } else {
                hasil = "Input Salah"
            }
            listener.tampilkanHasil(hasil)
        }
    }
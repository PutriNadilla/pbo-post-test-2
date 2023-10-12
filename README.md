# pbo-post-test-2
Nama : Putri Nadilla Maharani NIM : 2209116084 Kelas : Sistem Informasi B 2022

## Output Program
Setelah program dijalankan akan tertampil output yaitu daftar menu yang ingin dipilih, kemudian user akan diminta memasukkan pilihan menu yang ingin dijalankan. Jika user memilih "1" (Tambah Sepeda), maka user akan diminta untuk memasukkan data sepeda yang ingin ditambahkan, yaitu nama, merk, dan harga sepeda. Setelah data sepeda dimasukkan, program akan menampilkan output "sepeda telah berhasil ditambahkan". Jika user memilih "2" (Lihat Daftar Sepeda), program akan menampilkan daftar sepeda yang telah ditambahkan. Jika belum ada sepeda yang ditambahkan, program akan menampilkan output "Tidak ada daftar sepeda". Jika user memilih "3" (Update Sepeda), program akan meminta nama sepeda yang ingin diupdate, jika sepeda dengan nama tersebut ditemukan dalam daftar sepeda, setelah itu program akan meminta user memasukkan data sepeda yang baru (nama, merk, dan harga) untuk sepeda tersebut. Setelah sepeda diupdate, program akan menampilkan output "sepeda telah berhasil diupdate". Jika sepeda dengan nama yang diminta tidak ditemukan, program akan menampilkan output "sepeda tidak ditemukan". Jika user memilih "4" (Hapus Sepeda), user akan di minta untuk memasukkan nama sepeda yang ingin dihapus, jika sepeda dengan nama tersebut ditemukan dalam daftar sepeda, sepeda tersebut akan dihapus dari daftar. Jika user memilih "5" (Keluar), program akan menampilkan output "Terimakasih," dan mengakhiri program. Jika user memasukkan pilihan yang tidak valid selain dari 1-5, program akan menampilkan output "Pilihan tidak valid! Silakan masukkan pilihan dengan benar".

## Elemen Penting
- import com.mycompany.sepeda.*;: digunakan agar dapat menggunakan kelas yang ada dalam paket tersebut. 
- import java.util.ArrayList; digunakan untuk menyimpan daftar sepeda.
- import java.util.Scanner; digunakan untuk menerima input dari user.
- import java.util.Iterator; digunakan untuk mengiterasi melalui daftar sepeda dan menghapus sepeda selama iterasi.
- pada rogram ini menggunakan CRUD. case 1 create, case 2 read, case 3 update, case 4 remove
- public final class sepeda, merupakan deklarasi dari kelas sepeda. Kelas ini digunakan untuk merepresentasikan sepeda. 
- getNama(), getMerk(), dan getHarga() adalah metode yang digunakan untuk mengambil nilai dari properti sepeda. 
- public void setHarga(double harga) metode ini memungkinkan untuk mengubah nilai harga sepeda setelah objeknya dibuat.





<?php
class ATK {
    public $jenisBarang = 3;
    public $nama = [];
    public $stok = [];
    public $hrgSatuan = [];
    public $hrgStok = [];
    public $hrgTotal = 0;

    public function inputBarang() {
        echo "Masukkan Data Barang ATK:\n";
        for ($i = 0; $i < $this->jenisBarang; $i++) {
            echo "Nama Barang: ";
            $this->nama[$i] = trim(fgets(STDIN));

            echo "Jumlah Stok: ";
            $this->stok[$i] = (int) trim(fgets(STDIN));

            echo "Harga Satuan: ";
            $this->hrgSatuan[$i] = (int) trim(fgets(STDIN));

            echo "______________________\n";
        }
    }

    public function tampilBarang() {
        echo "Data Harga Barang ATK:\n";
        for ($i = 0; $i < $this->jenisBarang; $i++) {
            echo "Nama Barang: " . $this->nama[$i] . "\n";
            echo "Jumlah Stok: " . $this->stok[$i] . "\n";
            echo "Harga Satuan: Rp " . number_format($this->hrgSatuan[$i], 0, ',', '.') . "\n";

            $this->hrgStok[$i] = $this->hrgSatuan[$i] * $this->stok[$i];
            echo "Harga Keseluruhan: Rp " . number_format($this->hrgStok[$i], 0, ',', '.') . "\n";
            echo "______________________\n";
        }
    }

    public function hargaTotal() {
        $this->hrgTotal = array_sum($this->hrgStok);
        echo "Harga Total Seluruh Barang: Rp " . number_format($this->hrgTotal, 0, ',', '.') . "\n";
        echo "______________________\n";
    }
}


$obj = new ATK();
$obj->inputBarang();
$obj->tampilBarang();
$obj->hargaTotal();
?>
`
class PersegiPanjang
{
	protected int panjang;
	protected int lebar;
	
	public PersegiPanjang()
	{
		panjang=0;
		lebar=0;
	}
	
	public PersegiPanjang(int x, int y)
	{
		panjang=x;
		lebar=y;
	}
public void setPanjang(int x)
	{
		panjang=x;
	}
	
	public void setLebar(int y)
	{
		lebar=y;
	}
	
	public int getPanjang()
	{
		return panjang;
	}
	
	public int getLebar()
	{
		return lebar;
	}
    public int getLuas()
        {
            return panjang * lebar;
        }
        
        public String Tampil()
        {
            return "Panjang = "+panjang+
            ", Lebar = "+lebar;
        }
} //akhir dari class PersegiPanjang

class Balok1 extends PersegiPanjang//menggunakan inheritance
{
	private int tinggi;
	
	public Balok1 ()
	{
		panjang=0;
		lebar=0;
		tinggi=0;
	}
	
	public Balok1 (int x, int y, int z)
	{
		panjang=x;
		lebar=y;
		tinggi=z;
	}
	public void setTinggi(int z)
	{
		tinggi=z;
	}	
	public int getTinggi()
	{
		return tinggi;
	}
	public int getVolume()
	{
		return panjang * lebar * tinggi;
	}
	
	public String Tampil()
	{
		return "Panjang = "+panjang+
		", Lebar = "+lebar+", Tinggi = "+tinggi;
	}
}
public class TestBalok1
{
	public static void main (String args[])
	{
		Balok1 B1 = new Balok1(5,10,2);
		System.out.println(B1 .Tampil());
		B1.setPanjang(6);
		B1.setLebar(5);
		B1.setTinggi(3);
		System.out.println("Ukuran Balok yang baru");
		System.out.println("========================");
		System.out.println(B1.Tampil());
		System.out.println("Volume Balok = "+ B1.getVolume());
	}
}
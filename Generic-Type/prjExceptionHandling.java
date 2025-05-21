import java.io.*;

class ExceptionHandling{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        int bilangan;
        try{
            System.out.println("Masukkan bilangan bulat: ");
            bilangan = Integer.parseInt(br.readLine());
            System.out.println("Bilangan yang dimasukkan: " + bilangan);
        }
        catch(NumberFormatException e){
            System.out.println("Nilai yang di input harus berupa bilangan bulat");
        }
        finally{
            System.out.println("Program selesai");
        }
    }
}
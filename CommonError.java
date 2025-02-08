// This is a single-line comment

/* This is a multi-line comment */ 

/*
$ git remote add origin https://github.com/OWNER/REPOSITORY.git
# Set a new remote

1. Set remote dulu. List remote dengan "git remote -v", untuk munculin list remote github
2. "git remote set-url origin <url-baru>" untuk pindah remote
3. "git pull" jika pindah remote url/branch baru. Kalo engga tidak perlu
4. "git add ." untuk add semua file yang ada di directory local kita
5. "git commit -m <message>" untuk ngasih tahu perubahan di dalam github
6. "git push -u origin main" untuk push/masukin perubahan baru ke github link
*/

public class CommonError {
    public static void main(String[] args) {
        int value = 2147483647 + 1;
        System.out.println(value); // -2147483648

        // Displays 0.5000000000000001, not 0.5
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);

        // Displays 0.09999999999999998, not 0.1.
        System.out.println(1.0 - 0.9);
        
        double hasil = (1.0 - 0.9);
        // It outputs "Hasil Salah!"
        /* if (hasil==0.1) */ 
        // It outputs "Hasil Benar!"
        if (Math.abs(hasil-0.1) < 0.0001d)
            System.out.println("Hasil Benar!");
        else
            System.out.println("Hasil Salah!");

        int number1 = 1;
        int number2 = 2;

        // The output is 1
        int average = (number1 + number2) / 2;
        System.out.println(average);
    }
}
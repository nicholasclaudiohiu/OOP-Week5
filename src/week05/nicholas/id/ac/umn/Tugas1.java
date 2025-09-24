package week05.nicholas.id.ac.umn;

import java.util.Scanner;

public class Tugas1 {

    // === CLASS LINGKARAN ===
    static class Circle {
        private double radius;
        private String color;

        public Circle(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }

        public double getRadius() {
            return radius;
        }

        public String getColor() {
            return color;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    // === CLASS PERSEGI ===
    static class Square {
        private double side;
        private String color;

        public Square(double side, String color) {
            this.side = side;
            this.color = color;
        }

        public double getSide() {
            return side;
        }

        public String getColor() {
            return color;
        }

        public double getArea() {
            return side * side;
        }

        public double getPerimeter() {
            return 4 * side;
        }
    }

    // === CLASS PERSEGI PANJANG ===
    static class Rectangle {
        private double length;
        private double width;
        private String color;

        public Rectangle(double length, double width, String color) {
            this.length = length;
            this.width = width;
            this.color = color;
        }

        public double getLength() {
            return length;
        }

        public double getWidth() {
            return width;
        }

        public String getColor() {
            return color;
        }

        public double getArea() {
            return length * width;
        }

        public double getPerimeter() {
            return 2 * (length + width);
        }
    }

    // === CLASS SEGITIGA SIKU-SIKU ===
    static class Triangle {
        private double base;
        private double height;
        private String color;

        public Triangle(double base, double height, String color) {
            this.base = base;
            this.height = height;
            this.color = color;
        }

        public double getBase() {
            return base;
        }

        public double getHeight() {
            return height;
        }

        public String getColor() {
            return color;
        }

        public double getArea() {
            return 0.5 * base * height;
        }

        public double getPerimeter() {
            double hypotenuse = Math.sqrt(base * base + height * height);
            return base + height + hypotenuse;
        }
    }

    // === MAIN PROGRAM ===
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("-------Program Menghitung Bangun Datar-------");
            System.out.println("1. Lingkaran");
            System.out.println("2. Persegi");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Segitiga");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int pilih = s.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double r = s.nextDouble();
                    System.out.print("Masukkan warna: ");
                    String wLing = s.next();
                    Circle circle = new Circle(r, wLing);
                    System.out.println("-----------Lingkaran-----------");
                    System.out.println("Warna: " + circle.getColor());
                    System.out.println("Jari-jari: " + circle.getRadius());
                    System.out.println("Keliling Lingkaran: " + circle.getPerimeter());
                    System.out.println("Luas Lingkaran: " + circle.getArea());
                    break;

                case 2:
                    System.out.print("Masukkan sisi persegi: ");
                    double sisi = s.nextDouble();
                    System.out.print("Masukkan warna: ");
                    String wPersegi = s.next();
                    Square square = new Square(sisi, wPersegi);
                    System.out.println("-----------Persegi-----------");
                    System.out.println("Warna: " + square.getColor());
                    System.out.println("Sisi: " + square.getSide());
                    System.out.println("Keliling Persegi: " + square.getPerimeter());
                    System.out.println("Luas Persegi: " + square.getArea());
                    break;

                case 3:
                    System.out.print("Masukkan panjang persegi panjang: ");
                    double p = s.nextDouble();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    double l = s.nextDouble();
                    System.out.print("Masukkan warna: ");
                    String wPP = s.next();
                    Rectangle rect = new Rectangle(p, l, wPP);
                    System.out.println("-----------Persegi Panjang-----------");
                    System.out.println("Warna: " + rect.getColor());
                    System.out.println("Panjang: " + rect.getLength());
                    System.out.println("Lebar: " + rect.getWidth());
                    System.out.println("Keliling Persegi Panjang: " + rect.getPerimeter());
                    System.out.println("Luas Persegi Panjang: " + rect.getArea());
                    break;

                case 4:
                    System.out.print("Masukkan alas segitiga: ");
                    double a = s.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double t = s.nextDouble();
                    System.out.print("Masukkan warna: ");
                    String wSegitiga = s.next();
                    Triangle tri = new Triangle(a, t, wSegitiga);
                    System.out.println("-----------Segitiga Siku-Siku-----------");
                    System.out.println("Warna: " + tri.getColor());
                    System.out.println("Alas: " + tri.getBase());
                    System.out.println("Tinggi: " + tri.getHeight());
                    System.out.println("Keliling Segitiga: " + tri.getPerimeter());
                    System.out.println("Luas Segitiga: " + tri.getArea());
                    break;

                case 5:
                    System.out.println("Keluar program...");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        }
        s.close();
    }
}

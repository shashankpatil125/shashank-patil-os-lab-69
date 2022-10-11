

import java.io.*;

public class lode {
    static char M[][];
    static char R[] = new char[4];
    static char IR[] = new char[4];
    static int IC[] = new int[2];
    static int c;
    static char buffer[] = new char[41];

    static void init() {
        M = new char[100][4];
    }

    static void printMemory() {
        for (int i = 0; i < 100; i++) {
            System.out.print("M[" + i + "]");
            for (int j = 0; j < 4; j++) {
                System.out.print(M[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("C:\\Users\\shash\\Desktop\\my folder\\java\\os\\os\\src\\input.txt");
        FileWriter output = new FileWriter("C:\\Users\\shash\\Desktop\\my folder\\java\\os\\os\\src\\output.txt");
        BufferedReader br = new BufferedReader(file);
        String s = br.readLine();
        while (s != null) {

            if (s.startsWith("$AMJ")) {
                init();
                String program = br.readLine();
                int k = 0;
                int c = 0;
                for (int i = 0; i < program.length(); i++) {
                    if (program.charAt(i) == 'H')
                        break;
                    M[k][c] = program.charAt(i);
                    c++;
                    if (c == 4) {
                        c = 0;
                        k++;
                    }
                }
                M[k][c] = 'H';

            }

            // if (s.startsWith("$DTA")) {// startExecution();
            // }
            if (s.startsWith("$END"))
                printMemory();
            s = br.readLine();
        }
    }
}



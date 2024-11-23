package Recurssion.SUDUKO;

public class Suduko {



    public static boolean Possible(String[][]str,int n,int r,int c,int x)
    {

        int X = r;
        int Y = c;
        String val = String.valueOf(x);

    for(int i=0;i<n;i++)
    {
        if(str[r][i].equals(val))
        {
            return false;
        }

        if(str[i][c].equals(val))
        {
            return false;
        }

    }


        r = X;
        c = Y;
        // Condition 5; check each 3 * 3 box -> 9 boxes are going to be there ;
        // COL: 0 -> 2

        if(r<3 && c<3 ) {

            for (int a = 0; a <3; a++) {

                for (int b = 0; b < 3; b++) {

                    if (str[a][b].equals(val)) {

                        return false;

                    }

                }
            }

        }






            // COL: 3 -> 6
            // row: 0 -> 3



           else if(r<3 && c>=3 && c<6) {


                for (int a = 0; a < 3; a++) {

                    for (int b = 3; b < 6; b++) {

                        if (str[a][b].equals(val)) {

                            return false;

                        }

                    }
                }

        }


            // COL: 6 -> 9
            // row: 0 -> 3


          else  if(r<3 && c>6 ) {


                for (int a = 0; a < 3; a++) {

                    for (int b = 6; b < 9; b++) {

                        if (str[a][b].equals(val)) {

                            return false;

                        }

                    }
                }

            }


            // COL: 0 -> 3
            // row: 3 -> 6


           else if(r>=3 && r<6 && c<3 ) {

                for (int a = 3; a < 6; a++) {

                    for (int b = 0; b < 3; b++) {

                        if (str[a][b].equals(val)) {

                            return false;

                        }

                    }
                }

            }




            // COL: 3 -> 6
            // row: 3 -> 6


          else if(r>=3 && r<6 && c>3 && c<6 ) {

                for (int a = 3; a < 6; a++) {

                    for (int b = 3; b < 6; b++) {

                        if (str[a][b].equals(val)) {

                            return false;

                        }

                    }
                }

            }


            // COL: 6 -> 9
            // row: 3 -> 6


           else if(r>=3 && r<6 && c>6 ) {

                for (int a = 3; a < 6; a++) {

                    for (int b = 6; b < 9; b++) {

                        if (str[a][b].equals(val)) {

                            return false;

                        }

                    }
                }

            }



            // COL: 0 -> 3
            // row: 6 -> 9

          else  if(r>6 && c<3 ) {

                for (int a = 6; a < 9; a++) {

                    for (int b = 0; b < 3; b++) {

                        if (str[a][b].equals(val)) {

                            return false;

                        }

                    }
                }

            }



            // COL: 3 -> 6
            // row: 6 -> 9

           else if(r>6 && c>=3 && c<6 ) {

                for (int a = 6; a < 9; a++) {

                    for (int b = 3; b < 6; b++) {

                        if (str[a][b].equals(val)) {

                            return false;

                        }

                    }
                }

            }





            // COL: 6 -> 9
            // row: 6 -> 9

           else if(r>6 && c<9 ) {

                for (int a = 6; a < 9; a++) {

                    for (int b = 6; b < 9; b++) {

                        if (str[a][b].equals(val)) {

                            return false;

                        }

                    }
                }

            }





            return true;


    }


    public static boolean sudukoSolve(String[][]arr,int n,int r,int c) {


        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (arr[i][j].equals(".")) {
                    for (int ch = 1; ch <= n; ch++) {

                        if (Possible(arr, n, i, j, ch)) {
                            arr[i][j] = String.valueOf(ch);

                            if (sudukoSolve(arr, n, r, i) == true) {
                                return true;
                            } else {
                                arr[i][j] = ".";
                            }

                        }

                    }

                    return false;



                }






            }


        }

        return true;


    }





    public static void main(String[] args) {


        String[][] arr1 = {

                {"5", "3", ".", ".", "7", ".", ".", ".", "."},
                {"6", ".", ".", "1", "9", "5", ".", ".", "."},
                {".", "9", "8", ".", ".", ".", ".", "6", "."},
                {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
                {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
                {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
                {".", "6", ".", ".", ".", ".", "2", "8", "."},
                {".", ".", ".", "4", "1", "9", ".", ".", "5"},
                {".", ".", ".", ".", "8", ".", ".", "7", "9"}

    };

        int n=9;

        sudukoSolve(arr1,n,0,0);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++)
                System.out.print(arr1[i][j] + " ");
            System.out.println();
        }







    }

}

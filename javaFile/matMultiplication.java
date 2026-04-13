public 
        //matrix declaration
        int A[][] = new int[3][3];  
        int B[][] = new int[3][3];  
        int Mult[][] = new int[3][3]; //resultant matrix


        //first matrix input
        System.out.print("Enter Elements for first matrix: ");
        for(int i =0; i<3; i++){
            for(int j =0; j<3; j++){
                A[i][j] = sc.nextInt();
            }
        }
       
       //second matrix input
        System.out.print("Enter Elements for second matrix: ");
        for(int i =0; i<3; i++){
            for(int j =0; j<3; j++){
                B[i][j] = sc.nextInt();
            }
        }
       
       //multiplication logic
       for (int i = 0; i < 3; i++) {             
            for (int j = 0; j < 3; j++) {         
                Mult[i][j] = 0;                      
                for (int k = 0; k < 3; k++) {     
                    Mult[i][j] = Mult[i][j] +( A[i][k] * B[k][j]); // storing sum values for that particular row and column
                
    
                }
                System.out.print(Mult[i][j] + " "); //displaying while multiplying the elements
            }
            System.out.println();
        }

    //   System.out.println("Resultant Matrix after multiplication:");
    //     for (int i = 0; i < 3; i++) {
    //         for (int j = 0; j < 3; j++) {
                
    //         }
    //          //next line to form matrix structure
    //     } {
    
}

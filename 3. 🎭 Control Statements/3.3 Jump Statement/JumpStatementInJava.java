class JumpStatementInJava {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 8) {

                continue;

                
            }

            System.out.println("The Value is:" + i);

        }
    }
}
/*
 * 
 * lets see what exactly Continue
 * 
 * in the example i am printing the values from 1 to 10 but when i am using continue with condition if statemnet 
 * it is just skiping tha value it means 
 * when i amm saying 
 * 
 *      continue
 *      if(i==8){
 *     continue
 * }
 * 
 * syso(i)
 *  without continue the o/p is
 * 
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 
 * With Continue in example 
 * 
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * here the 8 is Skip due to continue
 * 9
 * 10
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

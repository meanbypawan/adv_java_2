/*
  Character
    |-isUpperCase()
    |-isLowerCase()
    |-isSpace()-------------> boolean
    |-isDigit()
    |-isAlaphabetic()

    All above method are static

 */
class TestMain{
    public static void main(String args[]){
        Character x = 'a';
        System.out.println(Character.isUpperCase(x));
        System.out.println(Character.isLowerCase(x));
        System.out.println(Character.isDigit(x));
        System.out.println(Character.isSpace(x));
        System.out.println(Character.isAlphabetic(x));
    }
}
package reflections;



class Test {

    public String name;
    public int age;
    @MyAdd("fff")
    public String sex;
//    private String s;

//    public Test() { s= "geek";}


    public Test(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Test(String name, int age) {
        this.name = name;
        this.age = age;

    }




}

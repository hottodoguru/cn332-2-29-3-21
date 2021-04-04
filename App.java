import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        /*Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        stringsort sts = new stringsort();
        sts.performsort(input);*/
        //System.out.printf("This is sorted String : %s\n",sts.get());
        person p1 = new person("kittisak","boonchalee",19,"male");
        person p2 = new person("suthichai","chawkaew",20,"male");
        person p3 = new person("chanoknun","chusakclip",22,"male");
        person p4 = new person("watcharin","chrutchit",25,"female");
        person p5 = new person("suthichai","chukaew",26,"male");
        person[] test = {p1,p2,p3,p4,p5};
        personsort sort = new personsort();
        person[] sorted = sort.performsort(test);
        for(int i=0;i<5;i++){
            System.out.println(sorted[i]);
        }
    }
}

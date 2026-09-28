//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner scanner = new Scanner(System.in);

    String[] city = {"CAPE TOWN","PORT ELIZABETH","PRETORIA"};
    String[] consoles ={"PS5","XBOX","SWITCH"};
    int[][] sales ={
            {1000,2000,3000},
            {2000,3000,4000},
            {1500,1100,1200}
    };
    String Line ="-".repeat(60);

    System.out.println(Line);
    System.out.println("GAMING CONSOLE REPORT");
    System.out.println(Line);
    System.out.printf("%-18s","");

    for (int console = 0; console < consoles.length; console++){
        System.out.printf("%-8s", consoles[console]);
    }
    System.out.println();

    for (int cities =0; cities < sales.length; cities++){
        System.out.printf("%-18s", city[cities]);
        for (int console = 0; console < sales[cities].length; console++){
            System.out.printf("%-8d", sales[console][cities]);
        }
        System.out.println();
    }

    System.out.println(Line);
    System.out.println("CONSOLE SALES TOTAL FOR EACH CITY");
    System.out.println(Line);




}

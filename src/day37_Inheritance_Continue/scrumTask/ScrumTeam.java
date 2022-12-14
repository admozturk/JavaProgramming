package day37_Inheritance_Continue.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public ProductOwner PO;
    public BusinessAnalyst BA;
    public ScrumMaster SM;

    // to be able to add testers (ArrayList<Testers>),  developers (ArrayList<Developers>)
    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();


    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }


    // addTester(Tester tester): adds the given tester to testers arraylist
    public void addTester(Tester tester){
        testers.add(tester);
    }

    // ddTesters(Tester[] testers): adds the given testers to testers arraylist
    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    // removeTester(int id): removes the tester with the given id from the arraylist of tester
    public void removeTester (int id){
        testers.removeIf(p -> p.id==id);
    }

   // addDeveloper(Developer developer): adds the given developer to testers arraylist
    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    // addDeveloper(Developer[] developer): adds the given developers to testers arraylist
    public void addDeveloper(Developer [] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    // removeDeveloper(int id): removes the developer with the given id from the arraylist of developer
    public void removeDeveloper(int id){
        developers.removeIf(p ->p.id ==id);
    }

    // toString(): displays the BA' name, SM' name, PO' name, number of testers and number of developers
    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.name +
                ", BA=" + BA.name +
                ", SM=" + SM.name +
                ", numbers of testers=" + testers.size() +
                ", numbers of developers=" + developers.size() +
                '}';
    }
}
/*
Creat a class named ScrumTeam:
            Variables:
                PO (ProductOwner), BA (BusinessAnalyst), SM (ScrumMaster),
                testers (ArrayList<Testers>),  developers (ArrayList<Developers>)

                Methods:
                addTester(Tester tester): adds the given tester to testers arraylist
                ddTesters(Tester[] testers): adds the given testers to testers arraylist
                removeTester(int id): removes the tester with the given id from the arraylist of tester
                addDeveloper(Developer developer): adds the given developer to testers arraylist
                addDeveloper(Developer[] developer): adds the given developers to testers arraylist
                removeDeveloper(int id): removes the developer with the given id from the arraylist of developer
                toString(): displays the BA' name, SM' name, PO' name, number of testers and number of developers
 */
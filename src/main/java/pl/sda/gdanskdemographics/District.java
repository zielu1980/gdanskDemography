package pl.sda.gdanskdemographics;

import javax.print.DocFlavor;

public class District {

   private String districtName;
   private String gender;
   private Integer ageUnderEighteen;
   private Integer ageFromEighteenAndFiftyNine;
   private Integer ageFromSixtyToSixtyFour;
   private Integer ageOverSixtyFour;

    public District(String districtName, String gender, Integer ageUnderEighteen, Integer ageFromEighteenAndFiftyNine, Integer ageFromSixtyToSixtyFour, Integer ageOverSixtyFour) {
        this.districtName = districtName;
        this.gender = gender;
        this.ageUnderEighteen = ageUnderEighteen;
        this.ageFromEighteenAndFiftyNine = ageFromEighteenAndFiftyNine;
        this.ageFromSixtyToSixtyFour = ageFromSixtyToSixtyFour;
        this.ageOverSixtyFour = ageOverSixtyFour;
    }
}

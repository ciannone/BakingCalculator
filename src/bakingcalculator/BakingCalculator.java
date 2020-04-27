/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakingcalculator;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Callable;

/**
 *
 * @author christianiannone
 */

public class BakingCalculator {
   
    //variables
    static double amtUsed;
    static double amtBought;
    static double amtCost;
    static String mmtBought;
    static String mmtUsed;
    static Map<String, Callable> recipes;

    //cup
    private static final double cupInGal = 16;
    private static final double cupInLiter = 4.2268;
    private static final double cupInMilliliter = 0.004225;
    private static final double cupInFluidOunce = 0.125;
    private static final double cupInPint = 2;
    private static final double cupInQuart = 4;
    private static final double cupInTablespoon = 0.0625;
    private static final double cupInTeaspoon = 0.0208;
    //gallon
    private static final double galInCup = 0.0625;
    private static final double galInLiter = 0.2642;
    private static final double galInMilliliter = 0.0002640625;
    private static final double galInFluidOunce = 0.0078125;
    private static final double galInPint = 0.125;
    private static final double galInQuart = 0.25;
    private static final double galInTablespoon = 0.00390625;
    private static final double galInTeaspoon = 0.001302083333;
    //liter
    private static final double literInCup = 0.2366;
    private static final double literInGallon = 3.7854;
    private static final double literInMilliliter = 0.001;
    private static final double literInFluidOunce = 0.0296;
    private static final double literInPint = 0.4732;
    private static final double literInQuart = 0.9464;
    private static final double literInTablespoon = 0.0148;
    private static final double literInTeaspoon = 0.004928921594;
    //milliliter
    private static final double milliliterInCup = 236.5882;
    private static final double milliliterInGallon = 3785.4;
    private static final double milliliterInLiter = 1000;
    private static final double milliliterInFluidOunce = 29.6;
    private static final double milliliterInPint = 473.1765;
    private static final double milliliterInQuart = 946.3529;
    private static final double milliliterInTablespoon = 14.7868;
    private static final double milliliterInTeaspoon = 4.9289;
    //fluidounce
    private static final double fluidOunceInCup = 8;
    private static final double fluidOunceInGallon = 128;
    private static final double fluidOunceInLiter = 33.814;
    private static final double fluidOunceInMilliliter = 0.0338;
    private static final double fluidOunceInPint = 16;
    private static final double fluidOunceInQuart = 32;
    private static final double fluidOunceInTablespoon = 0.5;
    private static final double fluidOunceInTeaspoon = 0.1667;
    //pint
    private static final double pintInCup = 0.5;
    private static final double pintInGallon = 8;
    private static final double pintInLiter = 2.1134;
    private static final double pintInMilliliter = 0.0021125;
    private static final double pintInFluidOunce = 0.0626;
    private static final double pintInQuart = 2;
    private static final double pintInTablespoon = 0.0313;
    private static final double pintInTeaspoon = 0.0104;
    //quart
    private static final double quartInCup = 0.25;
    private static final double quartInGallon = 4;
    private static final double quartInLiter = 1.0567;
    private static final double quartInMilliliter = 0.00105625;
    private static final double quartInFluidOunce = 0.03125;
    private static final double quartInPint = 0.5;
    private static final double quartInTablespoon = 0.0516;
    private static final double quartInTeaspoon = 0.005208333336;
    //tablespoon
    private static final double tablespoonInCup = 16;
    private static final double tablespoonInGallon = 256;
    private static final double tablespoonInLiter = 67.628;
    private static final double tablespoonInMilliliter = 0.0676;
    private static final double tablespoonInFluidOunce = 2;
    private static final double tablespoonInPint = 32;
    private static final double tablespoonInQuart = 64;
    private static final double tablespoonInTeaspoon = 0.3333;
    //teaspoon
    private static final double teaspoonInCup = 48;
    private static final double teaspoonInGallon = 768;
    private static final double teaspoonInLiter = 202.8841;
    private static final double teaspoonInMilliliter = 0.2028;
    private static final double teaspoonInFluidOunce = 6;
    private static final double teaspoonInPint = 96;
    private static final double teaspoonInQuart = 192;
    private static final double teaspoonInTablespoon = 3;
    
    //cup
    public static double cupUsedFromCup(){
        return(amtUsed * 1);
    }
    public static double cupUsedFromGal(){
        return (amtUsed/(amtBought * cupInGal));
    }
    public static double cupUsedFromLiter(){
        return (amtUsed/(amtBought * cupInLiter));
    }
    public static double cupUsedFromMilliliter(){
        return (amtUsed/(amtBought * cupInMilliliter));
    }
    public static double cupUsedFromFluidOunce(){
        return (amtUsed/(amtBought * cupInFluidOunce));
    }
    public static double cupUsedFromPint(){
        return (amtUsed/(amtBought * cupInPint));
    }
    public static double cupUsedFromQuart(){
        return (amtUsed/(amtBought * cupInQuart));
    }
    public static double cupUsedFromTablespoon(){
        return (amtUsed/(amtBought * cupInTablespoon));
    }
    public static double cupUsedFromTeaspoon(){
        return (amtUsed/(amtBought * cupInTeaspoon));
    }
    //gallon
    public static double galUsedFromGal(){
        return(amtUsed * 1);
    }
    public static double galUsedFromCup(){
        return (amtUsed/(amtBought * galInCup));
    }
    public static double galUsedFromLiter(){
        return (amtUsed/(amtBought * galInLiter));
    }
    public static double galUsedFromMilliliter(){
        return (amtUsed/(amtBought * galInMilliliter));
    }
    public static double galUsedFromFluidOunce(){
        return (amtUsed/(amtBought * galInFluidOunce));
    }
    public static double galUsedFromPint(){
        return (amtUsed/(amtBought * galInPint));
    }
    public static double galUsedFromQuart(){
        return (amtUsed/(amtBought * galInQuart));
    }
    public static double galUsedFromTablespoon(){
        return (amtUsed/(amtBought * galInTablespoon));
    }
    public static double galUsedFromTeaspoon(){
        return (amtUsed/(amtBought * galInTeaspoon));
    }
    //liter
    public static double literUsedFromLiter(){
        return(amtUsed * 1);
    }
    public static double literUsedFromGal(){
        return (amtUsed/(amtBought * literInGallon));
    }
    public static double literUsedFromCup(){
        return (amtUsed/(amtBought * literInCup));
    }
    public static double literUsedFromMilliliter(){
        return (amtUsed/(amtBought * literInMilliliter));
    }
    public static double literUsedFromFluidOunce(){
        return (amtUsed/(amtBought * literInFluidOunce));
    }
    public static double literUsedFromPint(){
        return (amtUsed/(amtBought * literInPint));
    }
    public static double literUsedFromQuart(){
        return (amtUsed/(amtBought * literInQuart));
    }
    public static double literUsedFromTablespoon(){
        return (amtUsed/(amtBought * literInTablespoon));
    }
    public static double literUsedFromTeaspoon(){
        return (amtUsed/(amtBought * literInTeaspoon));
    }
    //milliliter
    public static double milliliterUsedFromMilliliter(){
        return(amtUsed * 1);
    }
    public static double milliliterUsedFromGal(){
        return (amtUsed/(amtBought * milliliterInGallon));
    }
    public static double milliliterUsedFromLiter(){
        return (amtUsed/(amtBought * milliliterInLiter));
    }
    public static double milliliterUsedFromCup(){
        return (amtUsed/(amtBought * milliliterInCup));
    }
    public static double milliliterUsedFromFluidOunce(){
        return (amtUsed/(amtBought * milliliterInFluidOunce));
    }
    public static double milliliterUsedFromPint(){
        return (amtUsed/(amtBought * milliliterInPint));
    }
    public static double milliliterUsedFromQuart(){
        return (amtUsed/(amtBought * milliliterInQuart));
    }
    public static double milliliterUsedFromTablespoon(){
        return (amtUsed/(amtBought * milliliterInTablespoon));
    }
    public static double milliliterUsedFromTeaspoon(){
        return (amtUsed/(amtBought * milliliterInTeaspoon));
    }
    //fluid ounce
    public static double fluidOunceUsedFromFluidOunce(){
        return(amtUsed * 1);
    }
    public static double fluidOunceUsedFromGal(){
        return (amtUsed/(amtBought * fluidOunceInGallon));
    }
    public static double fluidOunceUsedFromLiter(){
        return (amtUsed/(amtBought * fluidOunceInLiter));
    }
    public static double fluidOunceUsedFromMilliliter(){
        return (amtUsed/(amtBought * fluidOunceInMilliliter));
    }
    public static double fluidOunceUsedFromCup(){
        return (amtUsed/(amtBought * fluidOunceInCup));
    }
    public static double fluidOunceUsedFromPint(){
        return (amtUsed/(amtBought * fluidOunceInPint));
    }
    public static double fluidOunceUsedFromQuart(){
        return (amtUsed/(amtBought * fluidOunceInQuart));
    }
    public static double fluidOunceUsedFromTablespoon(){
        return (amtUsed/(amtBought * fluidOunceInTablespoon));
    }
    public static double fluidOunceUsedFromTeaspoon(){
        return (amtUsed/(amtBought * fluidOunceInTeaspoon));
    }
    //pint
    public static double pintUsedFromPint(){
        return(amtUsed * 1);
    }
    public static double pintUsedFromGal(){
        return (amtUsed/(amtBought * pintInGallon));
    }
    public static double pintUsedFromLiter(){
        return (amtUsed/(amtBought * pintInLiter));
    }
    public static double pintUsedFromMilliliter(){
        return (amtUsed/(amtBought * pintInMilliliter));
    }
    public static double pintUsedFromFluidOunce(){
        return (amtUsed/(amtBought * pintInFluidOunce));
    }
    public static double pintUsedFromCup(){
        return (amtUsed/(amtBought * pintInCup));
    }
    public static double pintUsedFromQuart(){
        return (amtUsed/(amtBought * pintInQuart));
    }
    public static double pintUsedFromTablespoon(){
        return (amtUsed/(amtBought * pintInTablespoon));
    }
    public static double pintUsedFromTeaspoon(){
        return (amtUsed/(amtBought * pintInTeaspoon));
    }
    //quart
    public static double quartUsedFromQuart(){
        return(amtUsed * 1);
    }
    public static double quartUsedFromGal(){
        return (amtUsed/(amtBought * quartInGallon));
    }
    public static double quartUsedFromLiter(){
        return (amtUsed/(amtBought * quartInLiter));
    }
    public static double quartUsedFromMilliliter(){
        return (amtUsed/(amtBought * quartInMilliliter));
    }
    public static double quartUsedFromFluidOunce(){
        return (amtUsed/(amtBought * quartInFluidOunce));
    }
    public static double quartUsedFromPint(){
        return (amtUsed/(amtBought * quartInPint));
    }
    public static double quartUsedFromCup(){
        return (amtUsed/(amtBought * quartInCup));
    }
    public static double quartUsedFromTablespoon(){
        return (amtUsed/(amtBought * quartInTablespoon));
    }
    public static double quartUsedFromTeaspoon(){
        return (amtUsed/(amtBought * quartInTeaspoon));
    }
    //tablespoon
    public static double tablespoonUsedFromTablespoon(){
        return(amtUsed * 1);
    }
    public static double tablespoonUsedFromGal(){
        return (amtUsed/(amtBought * tablespoonInGallon));
    }
    public static double tablespoonUsedFromLiter(){
        return (amtUsed/(amtBought * tablespoonInLiter));
    }
    public static double tablespoonUsedFromMilliliter(){
        return (amtUsed/(amtBought * tablespoonInMilliliter));
    }
    public static double tablespoonUsedFromFluidOunce(){
        return (amtUsed/(amtBought * tablespoonInFluidOunce));
    }
    public static double tablespoonUsedFromPint(){
        return (amtUsed/(amtBought * tablespoonInPint));
    }
    public static double tablespoonUsedFromQuart(){
        return (amtUsed/(amtBought * tablespoonInQuart));
    }
    public static double tablespoonUsedFromCup(){
        return (amtUsed/(amtBought * tablespoonInCup));
    }
    public static double tablespoonUsedFromTeaspoon(){
        return (amtUsed/(amtBought * tablespoonInTeaspoon));
    }
    //teaspoon
    public static double teaspoonUsedFromTeaspoon(){
        return(amtUsed * 1);
    }
    public static double teaspoonUsedFromGal(){
        return (amtUsed/(amtBought * teaspoonInGallon));
    }
    public static double teaspoonUsedFromLiter(){
        return (amtUsed/(amtBought * teaspoonInLiter));
    }
    public static double teaspoonUsedFromMilliliter(){
        return (amtUsed/(amtBought * teaspoonInMilliliter));
    }
    public static double teaspoonUsedFromFluidOunce(){
        return (amtUsed/(amtBought * teaspoonInFluidOunce));
    }
    public static double teaspoonUsedFromPint(){
        return (amtUsed/(amtBought * teaspoonInPint));
    }
    public static double teaspoonUsedFromQuart(){
        return (amtUsed/(amtBought * teaspoonInQuart));
    }
    public static double teaspoonUsedFromTablespoon(){
        return (amtUsed/(amtBought * teaspoonInTablespoon));
    }
    public static double teaspoonUsedFromCup(){
        return (amtUsed/(amtBought * teaspoonInCup));
    }
    
    public static void main(String[] args) throws Exception {        
        Scanner scan = new Scanner(System.in);
        
        //declare map
        recipes = new HashMap<>();
        
        //populate map
        //cup
        recipes.put("cupcup", () -> cupUsedFromCup());
        recipes.put("cupgal",() -> cupUsedFromGal());
        recipes.put("cuplit",() -> cupUsedFromLiter());
        recipes.put("cupmil",() -> cupUsedFromMilliliter());
        recipes.put("cupflo",() -> cupUsedFromFluidOunce());
        recipes.put("cuppint",() -> cupUsedFromPint());
        recipes.put("cupqrt",() -> cupUsedFromQuart());
        recipes.put("cuptbsp",() -> cupUsedFromTablespoon());
        recipes.put("cuptsp",() -> cupUsedFromTeaspoon());
        //gallon
        recipes.put("galgal", () -> galUsedFromGal());
        recipes.put("galcup",() -> galUsedFromCup());
        recipes.put("gallit",() -> galUsedFromLiter());
        recipes.put("galmil",() -> galUsedFromMilliliter());
        recipes.put("galflo",() -> galUsedFromFluidOunce());
        recipes.put("galpint",() -> galUsedFromPint());
        recipes.put("galqrt",() -> galUsedFromQuart());
        recipes.put("galtbsp",() -> galUsedFromTablespoon());
        recipes.put("galtsp",() -> galUsedFromTeaspoon());
        //liter
        recipes.put("litlit", () -> literUsedFromLiter());
        recipes.put("litgal",() -> literUsedFromGal());
        recipes.put("litcup",() -> literUsedFromCup());
        recipes.put("litmil",() -> literUsedFromMilliliter());
        recipes.put("litflo",() -> literUsedFromFluidOunce());
        recipes.put("litpint",() -> literUsedFromPint());
        recipes.put("litqrt",() -> literUsedFromQuart());
        recipes.put("littbsp",() -> literUsedFromTablespoon());
        recipes.put("littsp",() -> literUsedFromTeaspoon());
        //milliliter
        recipes.put("milmil", () -> milliliterUsedFromMilliliter());
        recipes.put("milgal",() -> milliliterUsedFromGal());
        recipes.put("millit",() -> milliliterUsedFromLiter());
        recipes.put("milcup",() -> milliliterUsedFromCup());
        recipes.put("milflo",() -> milliliterUsedFromFluidOunce());
        recipes.put("milpint",() -> milliliterUsedFromPint());
        recipes.put("milqrt",() -> milliliterUsedFromQuart());
        recipes.put("miltbsp",() -> milliliterUsedFromTablespoon());
        recipes.put("miltsp",() -> milliliterUsedFromTeaspoon());
        //fluid ounce
        recipes.put("floflo", () -> fluidOunceUsedFromFluidOunce());
        recipes.put("flogal",() -> fluidOunceUsedFromGal());
        recipes.put("flolit",() -> fluidOunceUsedFromLiter());
        recipes.put("flomil",() -> fluidOunceUsedFromMilliliter());
        recipes.put("flocup",() -> fluidOunceUsedFromCup());
        recipes.put("flopint",() -> fluidOunceUsedFromPint());
        recipes.put("floqrt",() -> fluidOunceUsedFromQuart());
        recipes.put("flotbsp",() -> fluidOunceUsedFromTablespoon());
        recipes.put("flotsp",() -> fluidOunceUsedFromTeaspoon());
        //pint
        recipes.put("pintpint", () -> pintUsedFromPint());
        recipes.put("pintgal",() -> pintUsedFromGal());
        recipes.put("pintlit",() -> pintUsedFromLiter());
        recipes.put("pintmil",() -> pintUsedFromMilliliter());
        recipes.put("pintflo",() -> pintUsedFromFluidOunce());
        recipes.put("pintcup",() -> pintUsedFromCup());
        recipes.put("pintqrt",() -> pintUsedFromQuart());
        recipes.put("pinttbsp",() -> pintUsedFromTablespoon());
        recipes.put("pinttsp",() -> pintUsedFromTeaspoon());
        //quart
        recipes.put("qrtqrt", () -> quartUsedFromQuart());
        recipes.put("qrtgal",() -> quartUsedFromGal());
        recipes.put("qrtlit",() -> quartUsedFromLiter());
        recipes.put("qrtmil",() -> quartUsedFromMilliliter());
        recipes.put("qrtflo",() -> quartUsedFromFluidOunce());
        recipes.put("qrtpint",() -> quartUsedFromPint());
        recipes.put("qrtcup",() -> quartUsedFromCup());
        recipes.put("qrttbsp",() -> quartUsedFromTablespoon());
        recipes.put("qrttsp",() -> quartUsedFromTeaspoon());
        //tablespoon
        recipes.put("tbsptbsp", () -> tablespoonUsedFromTablespoon());
        recipes.put("tbspgal",() -> tablespoonUsedFromGal());
        recipes.put("tbsplit",() -> tablespoonUsedFromLiter());
        recipes.put("tbspmil",() -> tablespoonUsedFromMilliliter());
        recipes.put("tbspflo",() -> tablespoonUsedFromFluidOunce());
        recipes.put("tbsppint",() -> tablespoonUsedFromPint());
        recipes.put("tbspqrt",() -> tablespoonUsedFromQuart());
        recipes.put("tbspcup",() -> tablespoonUsedFromCup());
        recipes.put("tbsptsp",() -> tablespoonUsedFromTeaspoon());
        //teaspoon
        recipes.put("tsptsp", () -> teaspoonUsedFromTeaspoon());
        recipes.put("tspgal",() -> teaspoonUsedFromGal());
        recipes.put("tsplit",() -> teaspoonUsedFromLiter());
        recipes.put("tspmil",() -> teaspoonUsedFromMilliliter());
        recipes.put("tspflo",() -> teaspoonUsedFromFluidOunce());
        recipes.put("tsppint",() -> teaspoonUsedFromPint());
        recipes.put("tspqrt",() -> teaspoonUsedFromQuart());
        recipes.put("tsptbsp",() -> teaspoonUsedFromTablespoon());
        recipes.put("tspcup",() -> teaspoonUsedFromCup());
        
        CalcInterface ui = new CalcInterface();
        ui.setVisible(true);
    }
    
}

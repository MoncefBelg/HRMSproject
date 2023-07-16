package steps;

import pages.AQualificationLanguagePage;
import pages.DashboardPage;
import pages.EmployeePage;
import pages.EmployeeSearchPage;
import pages.LoginPage;
import pages.*;

public class PageInitializers {
    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static AQualificationLanguagePage aQualificationLanguagePage;
    public static EmployeePage employeePage;
    public static EmployeeSearchPage employeeSearchPage;
    public static PersonalPage personalPage;
    public static AddEmployeeJobDetailsPage addEmployeeJobDetailsPage;

    public static void initializePageObject(){
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        aQualificationLanguagePage = new AQualificationLanguagePage();
        employeePage = new EmployeePage();
        employeeSearchPage=new EmployeeSearchPage();
        personalPage=new PersonalPage();
        addEmployeeJobDetailsPage =new AddEmployeeJobDetailsPage();
    }
}

package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//li//a")
    List<WebElement> topMenuList;
    @CacheLookup
    @FindBy(xpath = "//div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li//ul//li//ul//a")
    List<WebElement> innerMenuList;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Sign in']")
    WebElement signInButton;
    @CacheLookup
    @FindBy(xpath = "//section[@id='block_various_links_footer']//ul//li//a")
    List<WebElement> informationFooterOptions;


    public void selectFromTopMenu(String selection){
        for(WebElement a : topMenuList){
            if(a.getText().equalsIgnoreCase(selection)){
                pmMouseHoverNoClick(a);
                break;
            }
        }
    }

    public void selectFromWomenSubMenu(String subMenuName){
        for(WebElement b : innerMenuList){
            if(b.getText().equalsIgnoreCase(subMenuName)){
                pmMouseHoverAndClick(b);
                break;
            }
        }
    }
    public void clickOnSignInButton(){
        pmClickOnElement(signInButton);
    }

    public void selectFromInformationFooter(String selection){
        for(WebElement item : informationFooterOptions){
            if(item.getText().equalsIgnoreCase(selection)){
                pmClickOnElement(item);
                break;
            }
        }
    }
}

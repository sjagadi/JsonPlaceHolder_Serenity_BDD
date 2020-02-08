package com.jsonplaceholder;
import org.junit.runner.RunWith;
import com.jsonplaceholder.base.BaseTest;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features")
public class PostsRunner extends BaseTest
{

}

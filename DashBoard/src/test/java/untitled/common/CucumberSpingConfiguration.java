package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.DashBoardApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { DashBoardApplication.class })
public class CucumberSpingConfiguration {}

package com.revature.integration.repository;

import com.revature.integration.repository.moon.negative.DaoMoonCreateTest;
import com.revature.integration.repository.moon.negative.DaoMoonDeleteTest;
import com.revature.integration.repository.moon.negative.DaoMoonReadTest;
import com.revature.integration.repository.moon.positive.DaoMoonTest;
import com.revature.integration.repository.planet.negative.DaoPlanetCreateTest;
import com.revature.integration.repository.planet.negative.DaoPlanetDeleteTest;
import com.revature.integration.repository.planet.negative.DaoPlanetReadTest;
import com.revature.integration.repository.planet.positive.DaoPlanetTest;
import com.revature.integration.repository.user.negative.DaoCreateUserTest;
import com.revature.integration.repository.user.negative.DaoFindUserTest;
import com.revature.integration.repository.user.positive.DaoUserTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        DaoMoonCreateTest.class,
        DaoMoonDeleteTest.class,
        DaoMoonReadTest.class,
        DaoMoonTest.class,

        DaoPlanetCreateTest.class,
        DaoPlanetDeleteTest.class,
        DaoPlanetReadTest.class,
        DaoPlanetTest.class,

        DaoCreateUserTest.class,
        DaoFindUserTest.class,
        DaoUserTest.class


})
public class IntegrationSuite {

}
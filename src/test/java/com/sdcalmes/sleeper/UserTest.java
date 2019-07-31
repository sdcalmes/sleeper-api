package com.sdcalmes.sleeper;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class UserTest
{

    private final Sleeper sleeper = new SleeperApi();
    private final String userNameToTest = "sdcalmes";
    private final String userIdToTest = "333314910077321216";

    //Test getting a user by name
    @Test
    public void testGetUserByName() throws SleeperError, IOException
    {
        User user = sleeper.users().getByUsername(userNameToTest);
        assertEquals("User received username does not match expected username!",
                userNameToTest, user.getUsername());
    }

    @Test
    public void testGetUserById() throws SleeperError, IOException
    {
        User user = sleeper.users().getById(userIdToTest);
        assertEquals("User received id does not match expected id!",
                userIdToTest, user.getUser_id());
    }


    //Get a user. User that user's id to get the same user. compare user id's
    @Test
    public void testUsersMatch() throws SleeperError, IOException
    {
        User user = sleeper.users().getByUsername(userNameToTest);
        User user2 = sleeper.users().getById(user.getUser_id());
        assertEquals("Users don't match!", user.getUser_id(), user2.getUser_id());
    }
}

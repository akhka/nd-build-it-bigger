package com.udacity.gradle.builditbigger;


import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.test.AndroidTestCase;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;


public class EndpointAsyncTaskTestUnit extends AndroidTestCase {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void testJokeIsNotEmpty() throws Exception{

        EndpointAsyncTask taskTest = new EndpointAsyncTask();
        taskTest.execute(InstrumentationRegistry.getContext());
        String joke = taskTest.getJoke();
        Assert.assertTrue(!joke.equals(""));

    }

    @Test
    public void testVerifyResponse(){

        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.joke_text)).check(matches(isDisplayed()));

    }

}

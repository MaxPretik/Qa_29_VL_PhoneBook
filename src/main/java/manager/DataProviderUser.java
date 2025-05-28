package manager;

import models.User;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderUser {

    @DataProvider
    public Iterator<Object[]> example(){
        List<Object[]>list = new ArrayList<>();

        return list.iterator();
    }

    @DataProvider
    public Iterator<Object[] > loginData(){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"margo@gmail.com","Mmar123456$"});
        list.add(new Object[]{"mara@gmail.com","Mmar123456$"});
        list.add(new Object[]{"sony@gmail.com","Ss12345$"});
        return list.iterator();
    }

    @DataProvider
    public Iterator<Object[]> loginModels(){
        List<Object[]>list = new ArrayList<>();
        list.add(new Object[]{new User().withEmail("margo@gmail.com").withPassword("Mmar123456$")});
        list.add(new Object[]{new User().withEmail("mara@gmail.com").withPassword("Mmar123456$")});
        list.add(new Object[]{new User().withEmail("sonya@gmail.com").withPassword("Ss12345$")});


        return list.iterator();
    }
    }


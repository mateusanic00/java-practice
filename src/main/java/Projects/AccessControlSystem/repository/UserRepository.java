package Projects.AccessControlSystem.repository;

import Projects.AccessControlSystem.model.User;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserRepository {
    private List<User> users;
    private String filePath;

    public UserRepository () {
        this.filePath = "data/users.json";
        this.users = new ArrayList<>();
    }

    public void save(User user) {
        users.add(user);
        Gson gson = new Gson();
        String json = gson.toJson(users);
        FileWriter writer = new FileWriter(filePath);
        writer.write(json);
        writer.close();

    }

    public List<User> listAll() {
        return users;
    }

    public void delete (Integer id) {
       Iterator<User> iterator = users.iterator();
       while(iterator.hasNext()) {
           User user = iterator.next();
           if (user.getId().equals(id)) {
               iterator.remove();
               break;
           }
       }


        /* for (User user: users) {
            if (user.getId().equals(id)) {
                users.remove(user);
            }
        }*/
    }

    public User searchById(Integer id) {
        for (User user: users) {
        if (user.getId().equals(id)) {
            return user;
            }
        }
        return null;
    }
}

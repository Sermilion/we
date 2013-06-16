/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entities.*;
import java.util.ArrayList;
import javax.ejb.Remote;

/**
 *
 * @author azamatibragimov
 */
@Remote
public interface BasketRemote {

    public void setUser(Users user);

    public Users getUser();

    public ArrayList<Article> getBasket();

    public void setBasket(Users user);

    public int getSize();

    public boolean addArticle(Article article);

    public boolean removeArticle(int index);
}

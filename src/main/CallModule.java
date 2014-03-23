/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VS
 */
public class CallModule {
    
    private List<Call> list;
    private final int LIST_CAPACITY = 20;
    
    public CallModule () {
    
        list = new ArrayList(LIST_CAPACITY);
    }
    
    public void addNewCall (Call call) {
        
        if (call != null) {
            list.add(call);
        }
    }
    
}

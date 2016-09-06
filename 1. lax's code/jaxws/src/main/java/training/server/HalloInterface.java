/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.server;

import javax.jws.WebService;

/**
 *
 * @author Richard
 */
@WebService
public interface HalloInterface {

    String getAbc();

    String getHelloWorld(String name);

    String getHelloWorldAsString(String name);
    
}

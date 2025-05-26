/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lab10;

/**
 *
 * @author Lim Joechele
 */
public interface MessageEncoder {
    public String encode(String plainText);
    public String decode(String cipherText);
}

package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import net.md_5.bungee.api.plugin.Plugin;

public class ConfigProxy {

	public File file;
	Plugin plugin;
	Properties properties;
	FileInputStream fileInputStream;
	FileOutputStream fileOutputStream;
	String comment;

	public ConfigProxy(String nameDaConfig, Plugin plugin) {
		String comment = this.comment;
		file = new File(plugin.getDataFolder(), nameDaConfig);
		properties = new Properties();
		if(file.exists()) {
			try {
				fileInputStream = new FileInputStream(file);
				properties.load(fileInputStream);
				fileInputStream.close();
			} catch (Exception e) { //Sem motivo a verificar ambas as exceções já que FileNotFoundException é uma subclasse de IOException. Como não podemos dar catch em ambos na mesma linha, preferi deixar uma exceção genérica (funciona igual, mas remove algumas linhas).
				e.printStackTrace();
			}
		}else {
			plugin.getDataFolder().mkdir();
		}
	}
	//Todos os métodos de linha única foram diminuídos a apenas uma linha. É mais uma questão estética
	public void set(String path, String value) { properties.setProperty(path,value); }
	public void set(String path, int i) {
		properties.setProperty(path,""+i);
	}
	public void save(){
		try {
			fileOutputStream = new FileOutputStream(file);
			properties.store(fileOutputStream, comment);
			fileOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Saving the properties of " + properties);
	}
	public void replace(String path, String value) {
		properties.replace(path,value);
	}
	public boolean contains(String path) { //Removido todas as verificações sem sentido. Se você só quer ver se uma boolean é true não há por quê inverter e depois ver se é igual a true.
		if(properties.contains(path)) {
			return true;
		}
		return false;
	}
	public boolean containsKey(String path) {
		if(properties.containsKey(path)) {
			return true;
		}
		return false;
	}
	public boolean containsValue(String path) {
		if(properties.containsValue(path)) {
			return true;
		}
		return false;
	}
	public void replace(String path, String oldValue, String newValue) {
		properties.replace(path, oldValue, newValue);
	}
	public void remove(String path) {
		properties.remove(path);
	}
	public void load(){
		try {
			fileInputStream = new FileInputStream(file);
			properties.load(fileInputStream);
			fileInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Loading properties of " + properties);
	}
	public Object get(String path) { return properties.get(path); }
	public String getString(String path) { return properties.getProperty(path); }
	public int getInt(String path) { return Integer.parseInt(properties.getProperty(path)); }
}
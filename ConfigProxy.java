package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import net.md_5.bungee.api.plugin.Plugin;

public class ConfigProxy {
	
	public File file;
	Plugin plugin;
	Properties properties = new Properties();
	FileInputStream fileInputStream;
	FileOutputStream fileOutputStream;
	String comentario;
	
	public ConfigProxy(String nameDaConfig, Plugin plugin, String comentario) {
		comentario = this.comentario;
		file = new File(plugin.getDataFolder(), nameDaConfig);
		if(file.exists()) {
			try {
				fileInputStream = new FileInputStream(file);
				properties.load(fileInputStream);
				fileInputStream.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			plugin.getDataFolder().mkdir();
		}
	}
	public void set(String caminho, String valor) {
		properties.setProperty(caminho,valor);
	}
	public void save(){
        try {
        	fileOutputStream = new FileOutputStream(file);
			properties.store(fileOutputStream, comentario);
			fileOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Depois de salvar as propriedades: " + properties);
    }
	public void replcace(String caminho, String valor) {
		properties.replace(caminho,valor);
	}
	public boolean contains(String caminho) {
		return properties.contains(caminho);
	}
	public boolean containsKey(String caminho) {
		return properties.containsKey(caminho);
	}
	public boolean containsValue(String caminho) {
		return properties.containsValue(caminho);
	}
	public void replcace(String caminho, String valorAntigo, String valorNovo) {
		properties.replace(caminho, valorAntigo, valorNovo);
	}
	public void remove(String caminho) {
		properties.remove(caminho);
	}
    public void load(){
        try {
        	fileInputStream = new FileInputStream(file);
			properties.load(fileInputStream);
			fileInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Ap�s carregar as propriedades: " + properties);
    }
	public Object get(String caminho) {
		return properties.get(caminho);
	}
	public String getString(String caminho) {
		return properties.getProperty(caminho);
	}
}
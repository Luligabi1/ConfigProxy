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
	Properties properties;
	FileInputStream fileInputStream;
	FileOutputStream fileOutputStream;
	String comentario;
	
	public ConfigProxy(String nameDaConfig, Plugin plugin, String comentario) {
		comentario = this.comentario;
		file = new File(plugin.getDataFolder(), nameDaConfig);
		properties = new Properties();
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
	public void set(String caminho, int i) {
		properties.setProperty(caminho,""+i);
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
		if(!properties.contains(caminho) == true) {
			return true;
		}
		return false;
	}
	public boolean containsKey(String caminho) {
		if(!properties.containsKey(caminho) == true) {
			return true;
		}
		return false;
	}
	public boolean containsValue(String caminho) {
		if(!properties.containsValue(caminho) == true) {
			return true;
		}
		return false;
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
        System.out.println("Após carregar as propriedades: " + properties);
    }
	public Object get(String caminho) {
		return properties.get(caminho);
	}
	public String getString(String caminho) {
		return properties.getProperty(caminho);
	}
	public int getInt(String caminho) {
		return Integer.parseInt(properties.getProperty(caminho));
	}
}
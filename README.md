# ConfigProxy
 Config para proxy, uma api para facilitar a vida dos dosenvolvedores.
 Vamos la como funciona:
<h1 align="center">
    <img alt="Pena" src="https://cdn.discordapp.com/attachments/782465411874684949/783336050399248404/Pena.png" />
    <br>
    Config Proxy
</h1>

<h4 align="center">
  Gifs/imagens do sistema.
</h4>

<p align="center">
  <img alt="Linnguagens utilizadas" src="https://img.shields.io/github/languages/top/lukemorales/react-native-design-code.svg">

  <img alt="total de linguagem" src="https://img.shields.io/github/languages/count/lukemorales/react-native-design-code.svg">

  <a href="https://google.com">
    <img alt="google" src="https://img.shields.io/github/license/lukemorales/react-native-design-code.svg">
  </a>
</p>

<p align="center">
  <img alt="App Demo" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSMSBEVZCPXQ92Dtk_aHHrxxIUbssAjkJcfg&usqp=CAU">
  <img alt="App Demo" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSMSBEVZCPXQ92Dtk_aHHrxxIUbssAjkJcfg&usqp=CAU">
</p>

## :rocket: Tecnologia.
Este projeto foi desenvolvido com as seguintes tecnologias:

-  [BungeeCord](https://www.spigotmc.org/wiki/bungeecord/)

## :information_source: Como usar.
```bash
# Adicione na class.java principal fora de metodos.
# ConfigProxy configProxySeuNome;
# 
# 
# Sempre nna inicialização do plugin tem que rodar este sistema primeiro ele carrega/constroi os arquivos.
# configProxySeuNome = new ConfigProxy("config.yml", this, "Descricão ,_,!");
# 
# 
# Metodo para salvar no arquivo.
# configProxy.save();
# 
# Verificação de boolean
# 
#	if(configProxy.contains("dados")) {}else {}
#	if(configProxy.containsKey("caminho")) {}else {}
#	if(configProxy.containsValue("caminho")) {}else {}
# 
# 
# Coletar dado especifico
#	configProxy.get("caminho"); //object/string
#	configProxy.getString("caminho"); //string
# 
# 
# Setar um dado
#	configProxy.set("caminho", "valor");
# 
# 
# Remover dado
# configProxy.remove(caminho);
# 
# 
# Trocar dados
# configProxy.replcace(caminho, valor);
#	configProxy.replcace(caminho, valorAntigo, valorNovo);
# 
# 
# Recarregar
# configProxy.load();
```

## :memo: Licença.
Este projeto está sob a licença do privada. Veja o [LICENÇA](https://google.com) para mais informações.

---

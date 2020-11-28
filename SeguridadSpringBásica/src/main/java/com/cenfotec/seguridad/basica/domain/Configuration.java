package com.cenfotec.seguridad.basica.domain;

public class Configuration {

    private String server;
    private String kafkaCluster;
    private boolean vpnEnabled;
    public String getServer() {
        return server;
    }
    public void setServer(String server) {
        this.server = server;
    }
    public String getKafkaCluster() {
        return kafkaCluster;
    }
    public void setKafkaCluster(String kafkaCluster) {
        this.kafkaCluster = kafkaCluster;
    }
    public boolean isVpnEnabled() {
        return vpnEnabled;
    }
    public void setVpnEnabled(boolean vpnEnabled) {
        this.vpnEnabled = vpnEnabled;
    }

    public Configuration() {

    }
}

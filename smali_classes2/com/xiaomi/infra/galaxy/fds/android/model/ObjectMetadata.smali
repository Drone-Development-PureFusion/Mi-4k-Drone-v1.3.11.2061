.class public Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;
.super Ljava/lang/Object;


# static fields
.field private static final PREDEFINED_HEADERS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final predefinedMetadata:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final userMetadata:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->PREDEFINED_HEADERS:Ljava/util/Set;

    sget-object v0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->PREDEFINED_HEADERS:Ljava/util/Set;

    const-string v1, "Last-Modified"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->PREDEFINED_HEADERS:Ljava/util/Set;

    const-string v1, "Content-MD5"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->PREDEFINED_HEADERS:Ljava/util/Set;

    const-string v1, "Content-Type"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->PREDEFINED_HEADERS:Ljava/util/Set;

    const-string v1, "Content-Length"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->PREDEFINED_HEADERS:Ljava/util/Set;

    const-string v1, "Content-Encoding"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->PREDEFINED_HEADERS:Ljava/util/Set;

    const-string v1, "Cache-Control"

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->userMetadata:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->predefinedMetadata:Ljava/util/Map;

    return-void
.end method

.method public static parseObjectMetadata([Lorg/apache/http/Header;)Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;
    .locals 6

    new-instance v1, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;

    invoke-direct {v1}, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;-><init>()V

    array-length v2, p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_2

    aget-object v3, p0, v0

    invoke-interface {v3}, Lorg/apache/http/Header;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v3

    const-string v5, "x-xiaomi-meta-"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v1, v4, v3}, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->addUserMetadata(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    sget-object v5, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->PREDEFINED_HEADERS:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v1, v4, v3}, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->addPredefinedMetadata(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    return-object v1
.end method


# virtual methods
.method public addPredefinedMetadata(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->predefinedMetadata:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public addUserMetadata(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->userMetadata:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public getAllMetadata()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->predefinedMetadata:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iget-object v1, p0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->userMetadata:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object v0
.end method

.method public getCacheControl()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->predefinedMetadata:Ljava/util/Map;

    const-string v1, "Cache-Control"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getContentEncoding()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->predefinedMetadata:Ljava/util/Map;

    const-string v1, "Content-Encoding"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getContentLength()J
    .locals 2

    iget-object v0, p0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->predefinedMetadata:Ljava/util/Map;

    const-string v1, "Content-Length"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    goto :goto_0
.end method

.method public getContentMD5()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->predefinedMetadata:Ljava/util/Map;

    const-string v1, "Content-MD5"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getContentType()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->predefinedMetadata:Ljava/util/Map;

    const-string v1, "Content-Type"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getLastModified()Ljava/util/Date;
    .locals 3

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->predefinedMetadata:Ljava/util/Map;

    const-string v2, "Last-Modified"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {v0}, Lcom/xiaomi/infra/galaxy/fds/android/util/Util;->parseDate(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method public getUserMetadata()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->userMetadata:Ljava/util/Map;

    return-object v0
.end method

.method public setCacheControl(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->predefinedMetadata:Ljava/util/Map;

    const-string v1, "Cache-Control"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentEncoding(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->predefinedMetadata:Ljava/util/Map;

    const-string v1, "Content-Encoding"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentLength(J)V
    .locals 3

    iget-object v0, p0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->predefinedMetadata:Ljava/util/Map;

    const-string v1, "Content-Length"

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentMD5(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->predefinedMetadata:Ljava/util/Map;

    const-string v1, "Content-MD5"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setContentType(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->predefinedMetadata:Ljava/util/Map;

    const-string v1, "Content-Type"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setLastModified(Ljava/util/Date;)V
    .locals 3

    iget-object v0, p0, Lcom/xiaomi/infra/galaxy/fds/android/model/ObjectMetadata;->predefinedMetadata:Ljava/util/Map;

    const-string v1, "Last-Modified"

    invoke-static {p1}, Lcom/xiaomi/infra/galaxy/fds/android/util/Util;->formatDateString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

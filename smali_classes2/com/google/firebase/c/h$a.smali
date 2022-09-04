.class public Lcom/google/firebase/c/h$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/c/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:Lcom/google/firebase/c/h;

.field b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/firebase/c/h;

    invoke-direct {v0}, Lcom/google/firebase/c/h;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/c/h;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/firebase/c/h;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lcom/google/firebase/c/h;-><init>(Lcom/google/firebase/c/h;ZLcom/google/firebase/c/h$1;)V

    iput-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    return-void
.end method

.method constructor <init>(Lorg/json/JSONObject;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/firebase/c/h;

    invoke-direct {v0}, Lcom/google/firebase/c/h;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/google/firebase/c/h$a;->a(Lorg/json/JSONObject;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/firebase/c/h$a;->b:Z

    :cond_0
    return-void
.end method

.method constructor <init>(Lorg/json/JSONObject;Lcom/google/firebase/c/i;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/firebase/c/h$a;-><init>(Lorg/json/JSONObject;)V

    iget-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    invoke-static {v0, p2}, Lcom/google/firebase/c/h;->a(Lcom/google/firebase/c/h;Lcom/google/firebase/c/i;)Lcom/google/firebase/c/i;

    return-void
.end method

.method private a(Lorg/json/JSONObject;)V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    const-string v1, "generation"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/c/h;->a(Lcom/google/firebase/c/h;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    const-string v1, "name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/c/h;->b(Lcom/google/firebase/c/h;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    const-string v1, "bucket"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/c/h;->c(Lcom/google/firebase/c/h;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    const-string v1, "metageneration"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/c/h;->d(Lcom/google/firebase/c/h;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    const-string v1, "timeCreated"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/c/h;->e(Lcom/google/firebase/c/h;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    const-string v1, "updated"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/c/h;->f(Lcom/google/firebase/c/h;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    const-string v1, "size"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/google/firebase/c/h;->a(Lcom/google/firebase/c/h;J)J

    iget-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    const-string v1, "md5Hash"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/c/h;->g(Lcom/google/firebase/c/h;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    const-string v1, "downloadTokens"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/c/h;->h(Lcom/google/firebase/c/h;Ljava/lang/String;)V

    const-string v0, "contentType"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/firebase/c/h$a;->e(Ljava/lang/String;)Lcom/google/firebase/c/h$a;

    const-string v0, "metadata"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "metadata"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v0, v3}, Lcom/google/firebase/c/h$a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/c/h$a;

    goto :goto_0

    :cond_0
    const-string v0, "cacheControl"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/firebase/c/h$a;->d(Ljava/lang/String;)Lcom/google/firebase/c/h$a;

    const-string v0, "contentDisposition"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/firebase/c/h$a;->c(Ljava/lang/String;)Lcom/google/firebase/c/h$a;

    const-string v0, "\'contentEncoding"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/firebase/c/h$a;->b(Ljava/lang/String;)Lcom/google/firebase/c/h$a;

    const-string v0, "\'contentLanguage"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/firebase/c/h$a;->a(Ljava/lang/String;)Lcom/google/firebase/c/h$a;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/google/firebase/c/h$a;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    invoke-static {v0, p1}, Lcom/google/firebase/c/h;->i(Lcom/google/firebase/c/h;Ljava/lang/String;)Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/c/h$a;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    invoke-static {v0}, Lcom/google/firebase/c/h;->a(Lcom/google/firebase/c/h;)Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0, v1}, Lcom/google/firebase/c/h;->a(Lcom/google/firebase/c/h;Ljava/util/Map;)Ljava/util/Map;

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    invoke-static {v0}, Lcom/google/firebase/c/h;->a(Lcom/google/firebase/c/h;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public a()Lcom/google/firebase/c/h;
    .locals 4

    new-instance v0, Lcom/google/firebase/c/h;

    iget-object v1, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    iget-boolean v2, p0, Lcom/google/firebase/c/h$a;->b:Z

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/firebase/c/h;-><init>(Lcom/google/firebase/c/h;ZLcom/google/firebase/c/h$1;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/google/firebase/c/h$a;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    invoke-static {v0, p1}, Lcom/google/firebase/c/h;->j(Lcom/google/firebase/c/h;Ljava/lang/String;)Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/google/firebase/c/h$a;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    invoke-static {v0, p1}, Lcom/google/firebase/c/h;->k(Lcom/google/firebase/c/h;Ljava/lang/String;)Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/google/firebase/c/h$a;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    invoke-static {v0, p1}, Lcom/google/firebase/c/h;->l(Lcom/google/firebase/c/h;Ljava/lang/String;)Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lcom/google/firebase/c/h$a;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/c/h$a;->a:Lcom/google/firebase/c/h;

    invoke-static {v0, p1}, Lcom/google/firebase/c/h;->m(Lcom/google/firebase/c/h;Ljava/lang/String;)Ljava/lang/String;

    return-object p0
.end method

.class public Lcom/google/android/gms/internal/gs;
.super Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private c:Landroid/content/SharedPreferences;

.field private d:Lcom/google/android/gms/internal/nr;

.field private e:Lcom/google/android/gms/internal/oc;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/nr;)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/android/gms/internal/nr;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v3, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gs;->b:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gs;->a:Landroid/content/Context;

    const-string v0, "com.google.firebase.auth.api.Store.%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/internal/gs;->b:Ljava/lang/String;

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/nr;

    iput-object v0, p0, Lcom/google/android/gms/internal/gs;->d:Lcom/google/android/gms/internal/nr;

    new-instance v0, Lcom/google/android/gms/internal/oc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/oc;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/gs;->e:Lcom/google/android/gms/internal/oc;

    iget-object v0, p0, Lcom/google/android/gms/internal/gs;->a:Landroid/content/Context;

    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/gs;->c:Landroid/content/SharedPreferences;

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/oa;)Lcom/google/android/gms/internal/go;
    .locals 11
    .param p1    # Lcom/google/android/gms/internal/oa;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "cachedTokenState"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/oa;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/nx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nx;->c()Ljava/lang/String;

    move-result-object v3

    const-string v0, "applicationName"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/oa;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/nx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nx;->c()Ljava/lang/String;

    move-result-object v4

    const-string v0, "anonymous"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/oa;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/nx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/nx;->g()Z

    move-result v5

    const-string v0, "2"

    const-string v1, "version"

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/oa;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/nx;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/nx;->k()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/nx;->c()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    :goto_0
    const-string v0, "userInfos"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/oa;->c(Ljava/lang/String;)Lcom/google/android/gms/internal/nu;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/nu;->a()I

    move-result v7

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v7}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v0, 0x0

    move v2, v0

    :goto_1
    if-ge v2, v7, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/gs;->d:Lcom/google/android/gms/internal/nr;

    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/nu;->a(I)Lcom/google/android/gms/internal/nx;

    move-result-object v9

    const-class v10, Lcom/google/android/gms/internal/gm;

    invoke-virtual {v0, v9, v10}, Lcom/google/android/gms/internal/nr;->a(Lcom/google/android/gms/internal/nx;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gm;

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    :cond_0
    invoke-static {v4}, Lcom/google/firebase/b;->a(Ljava/lang/String;)Lcom/google/firebase/b;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/go;

    invoke-direct {v2, v0, v8}, Lcom/google/android/gms/internal/go;-><init>(Lcom/google/firebase/b;Ljava/util/List;)V

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/gs;->d:Lcom/google/android/gms/internal/nr;

    const-class v4, Lcom/google/firebase/auth/api/model/GetTokenResponse;

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/nr;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/api/model/GetTokenResponse;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/go;->a(Lcom/google/firebase/auth/api/model/GetTokenResponse;)V

    :cond_1
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/go;->b(Z)Lcom/google/firebase/auth/n;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/go;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/go;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/go;

    return-object v2

    :cond_2
    move-object v1, v0

    goto :goto_0
.end method

.method private static c(Ljava/lang/String;)Lcom/google/android/gms/internal/nx;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/oc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/oc;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/oc;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/nx;

    move-result-object v0

    return-object v0
.end method

.method private d(Lcom/google/firebase/auth/n;)Ljava/lang/String;
    .locals 6
    .param p1    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    new-instance v2, Lcom/google/android/gms/internal/oa;

    invoke-direct {v2}, Lcom/google/android/gms/internal/oa;-><init>()V

    const-class v0, Lcom/google/android/gms/internal/go;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    check-cast p1, Lcom/google/android/gms/internal/go;

    const-string v0, "cachedTokenState"

    invoke-virtual {p1}, Lcom/google/android/gms/internal/go;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/oa;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "applicationName"

    invoke-virtual {p1}, Lcom/google/android/gms/internal/go;->g()Lcom/google/firebase/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/oa;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "type"

    const-string v1, "com.google.firebase.auth.internal.DefaultFirebaseUser"

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/oa;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/go;->h()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v3, Lcom/google/android/gms/internal/nu;

    invoke-direct {v3}, Lcom/google/android/gms/internal/nu;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/go;->h()Ljava/util/List;

    move-result-object v4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gm;

    iget-object v5, p0, Lcom/google/android/gms/internal/gs;->d:Lcom/google/android/gms/internal/nr;

    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/nr;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/gs;->c(Ljava/lang/String;)Lcom/google/android/gms/internal/nx;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/nu;->a(Lcom/google/android/gms/internal/nx;)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    const-string v0, "userInfos"

    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/internal/oa;->a(Ljava/lang/String;Lcom/google/android/gms/internal/nx;)V

    :cond_1
    const-string v0, "anonymous"

    invoke-virtual {p1}, Lcom/google/android/gms/internal/go;->i()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/oa;->a(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v0, "version"

    const-string v1, "2"

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/oa;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/oa;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method


# virtual methods
.method public a()Lcom/google/firebase/auth/n;
    .locals 4
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    const-string v1, "com.google.firebase.auth.FIREBASE_USER"

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/gs;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/gs;->e:Lcom/google/android/gms/internal/oc;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/oc;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/nx;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/nx;->l()Lcom/google/android/gms/internal/oa;

    move-result-object v1

    const-string v2, "type"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/oa;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "type"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/oa;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/nx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/nx;->c()Ljava/lang/String;

    move-result-object v2

    const-string v3, "com.google.firebase.auth.internal.DefaultFirebaseUser"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/gs;->a(Lcom/google/android/gms/internal/oa;)Lcom/google/android/gms/internal/go;
    :try_end_0
    .catch Lcom/google/android/gms/internal/og; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/gs;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/gs;->d:Lcom/google/android/gms/internal/nr;

    invoke-virtual {v1, v0, p2}, Lcom/google/android/gms/internal/nr;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/google/firebase/auth/n;)V
    .locals 2
    .param p1    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/gs;->d(Lcom/google/firebase/auth/n;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "com.google.firebase.auth.FIREBASE_USER"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/gs;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/firebase/auth/n;Lcom/google/firebase/auth/api/model/GetTokenResponse;)V
    .locals 4
    .param p1    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/firebase/auth/api/model/GetTokenResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/google/firebase/auth/n;->a()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/gs;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gs;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/gs;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/gs;->d:Lcom/google/android/gms/internal/nr;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/nr;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gs;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public b(Lcom/google/firebase/auth/n;)Lcom/google/firebase/auth/api/model/GetTokenResponse;
    .locals 4
    .param p1    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/google/firebase/auth/n;->a()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/google/firebase/auth/api/model/GetTokenResponse;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/gs;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/api/model/GetTokenResponse;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/gs;->c:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 1

    const-string v0, "com.google.firebase.auth.FIREBASE_USER"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gs;->a(Ljava/lang/String;)V

    return-void
.end method

.method public c(Lcom/google/firebase/auth/n;)V
    .locals 4
    .param p1    # Lcom/google/firebase/auth/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/google/firebase/auth/n;->a()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gs;->a(Ljava/lang/String;)V

    return-void
.end method

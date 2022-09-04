.class public Lcom/google/android/gms/config/internal/c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ajr;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/config/internal/c$c;,
        Lcom/google/android/gms/config/internal/c$d;,
        Lcom/google/android/gms/config/internal/c$b;,
        Lcom/google/android/gms/config/internal/c$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/nio/charset/Charset;

.field private static final b:Ljava/util/regex/Pattern;

.field private static final c:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x2

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/config/internal/c;->a:Ljava/nio/charset/Charset;

    const-string v0, "^(1|true|t|yes|y|on)$"

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/config/internal/c;->b:Ljava/util/regex/Pattern;

    const-string v0, "^(0|false|f|no|n|off|)$"

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/config/internal/c;->c:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(I)Lcom/google/android/gms/common/api/Status;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/config/internal/c;->b(I)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/config/internal/FetchConfigIpcResponse;)Ljava/util/HashMap;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/config/internal/c;->b(Lcom/google/android/gms/config/internal/FetchConfigIpcResponse;)Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method private static b(I)Lcom/google/android/gms/common/api/Status;
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    invoke-static {p0}, Lcom/google/android/gms/internal/ajs;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    return-object v0
.end method

.method private static b(Lcom/google/android/gms/config/internal/FetchConfigIpcResponse;)Ljava/util/HashMap;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/config/internal/FetchConfigIpcResponse;",
            ")",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/TreeMap",
            "<",
            "Ljava/lang/String;",
            "[B>;>;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/config/internal/FetchConfigIpcResponse;->c()Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/google/android/gms/common/data/k;

    sget-object v2, Lcom/google/android/gms/config/internal/PackageConfigTable;->CREATOR:Lcom/google/android/gms/config/internal/k;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/data/k;-><init>(Lcom/google/android/gms/common/data/DataHolder;Landroid/os/Parcelable$Creator;)V

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/data/b;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/config/internal/PackageConfigTable;

    invoke-virtual {p0}, Lcom/google/android/gms/config/internal/FetchConfigIpcResponse;->e()V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/config/internal/PackageConfigTable;->b()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v4, Ljava/util/TreeMap;

    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    invoke-virtual {v2, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/android/gms/config/internal/PackageConfigTable;->b()Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v5}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v5, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v7

    invoke-virtual {v4, v1, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    move-object v0, v2

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/ajr$a;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/internal/ajr$a;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/internal/ajr$b;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/config/internal/c$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/config/internal/c$1;-><init>(Lcom/google/android/gms/config/internal/c;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/ajr$a;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    goto :goto_0
.end method

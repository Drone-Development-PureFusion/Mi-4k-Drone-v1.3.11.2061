.class public Lcom/google/android/gms/wearable/q;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/wearable/PutDataRequest;

.field private final b:Lcom/google/android/gms/wearable/k;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/wearable/PutDataRequest;Lcom/google/android/gms/wearable/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wearable/q;->a:Lcom/google/android/gms/wearable/PutDataRequest;

    new-instance v0, Lcom/google/android/gms/wearable/k;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/k;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/wearable/q;->b:Lcom/google/android/gms/wearable/k;

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/q;->b:Lcom/google/android/gms/wearable/k;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/wearable/k;->a(Lcom/google/android/gms/wearable/k;)V

    :cond_0
    return-void
.end method

.method public static a(Lcom/google/android/gms/wearable/l;)Lcom/google/android/gms/wearable/q;
    .locals 3

    new-instance v0, Lcom/google/android/gms/wearable/q;

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/l;->a()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/wearable/PutDataRequest;->a(Landroid/net/Uri;)Lcom/google/android/gms/wearable/PutDataRequest;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/l;->b()Lcom/google/android/gms/wearable/k;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wearable/q;-><init>(Lcom/google/android/gms/wearable/PutDataRequest;Lcom/google/android/gms/wearable/k;)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Lcom/google/android/gms/wearable/q;
    .locals 3

    new-instance v0, Lcom/google/android/gms/wearable/q;

    invoke-static {p0}, Lcom/google/android/gms/wearable/PutDataRequest;->a(Ljava/lang/String;)Lcom/google/android/gms/wearable/PutDataRequest;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wearable/q;-><init>(Lcom/google/android/gms/wearable/PutDataRequest;Lcom/google/android/gms/wearable/k;)V

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Lcom/google/android/gms/wearable/q;
    .locals 3

    new-instance v0, Lcom/google/android/gms/wearable/q;

    invoke-static {p0}, Lcom/google/android/gms/wearable/PutDataRequest;->b(Ljava/lang/String;)Lcom/google/android/gms/wearable/PutDataRequest;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wearable/q;-><init>(Lcom/google/android/gms/wearable/PutDataRequest;Lcom/google/android/gms/wearable/k;)V

    return-object v0
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/q;->a:Lcom/google/android/gms/wearable/PutDataRequest;

    invoke-virtual {v0}, Lcom/google/android/gms/wearable/PutDataRequest;->a()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/google/android/gms/wearable/k;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/q;->b:Lcom/google/android/gms/wearable/k;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/wearable/q;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/q;->a:Lcom/google/android/gms/wearable/PutDataRequest;

    invoke-virtual {v0}, Lcom/google/android/gms/wearable/PutDataRequest;->g()Lcom/google/android/gms/wearable/PutDataRequest;

    return-object p0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/q;->a:Lcom/google/android/gms/wearable/PutDataRequest;

    invoke-virtual {v0}, Lcom/google/android/gms/wearable/PutDataRequest;->f()Z

    move-result v0

    return v0
.end method

.method public e()Lcom/google/android/gms/wearable/PutDataRequest;
    .locals 10

    iget-object v0, p0, Lcom/google/android/gms/wearable/q;->b:Lcom/google/android/gms/wearable/k;

    invoke-static {v0}, Lcom/google/android/gms/internal/fe;->a(Lcom/google/android/gms/wearable/k;)Lcom/google/android/gms/internal/fe$a;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/wearable/q;->a:Lcom/google/android/gms/wearable/PutDataRequest;

    iget-object v1, v2, Lcom/google/android/gms/internal/fe$a;->a:Lcom/google/android/gms/internal/ff;

    invoke-static {v1}, Lcom/google/android/gms/internal/rd;->a(Lcom/google/android/gms/internal/rd;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wearable/PutDataRequest;->a([B)Lcom/google/android/gms/wearable/PutDataRequest;

    iget-object v0, v2, Lcom/google/android/gms/internal/fe$a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_4

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v0, v2, Lcom/google/android/gms/internal/fe$a;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/Asset;

    if-nez v4, :cond_0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1a

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "asset key cannot be null: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    if-nez v0, :cond_2

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "asset cannot be null: key="

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const-string v5, "DataMap"

    const/4 v6, 0x3

    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v5, "DataMap"

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    add-int/lit8 v8, v8, 0x21

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    add-int/2addr v8, v9

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v8, "asPutDataRequest: adding asset: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    iget-object v5, p0, Lcom/google/android/gms/wearable/q;->a:Lcom/google/android/gms/wearable/PutDataRequest;

    invoke-virtual {v5, v4, v0}, Lcom/google/android/gms/wearable/PutDataRequest;->a(Ljava/lang/String;Lcom/google/android/gms/wearable/Asset;)Lcom/google/android/gms/wearable/PutDataRequest;

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/wearable/q;->a:Lcom/google/android/gms/wearable/PutDataRequest;

    return-object v0
.end method

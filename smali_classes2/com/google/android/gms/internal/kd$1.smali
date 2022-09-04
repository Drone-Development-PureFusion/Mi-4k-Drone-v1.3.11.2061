.class Lcom/google/android/gms/internal/kd$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/kd;->a()Ljava/util/Comparator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/google/android/gms/internal/ka;",
        ">;"
    }
.end annotation


# static fields
.field static final synthetic a:Z


# instance fields
.field final synthetic b:Lcom/google/android/gms/internal/kd;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/kd;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/kd$1;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lcom/google/android/gms/internal/kd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/kd$1;->b:Lcom/google/android/gms/internal/kd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ka;Lcom/google/android/gms/internal/ka;)I
    .locals 4

    sget-boolean v0, Lcom/google/android/gms/internal/kd$1;->a:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->a()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ka;->a()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/lg;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->a()Lcom/google/android/gms/internal/kv;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ka;->c()Lcom/google/android/gms/internal/lc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/lc;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/lg;-><init>(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V

    new-instance v1, Lcom/google/android/gms/internal/lg;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ka;->a()Lcom/google/android/gms/internal/kv;

    move-result-object v2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ka;->c()Lcom/google/android/gms/internal/lc;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/lc;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/lg;-><init>(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/kd$1;->b:Lcom/google/android/gms/internal/kd;

    invoke-static {v2}, Lcom/google/android/gms/internal/kd;->a(Lcom/google/android/gms/internal/kd;)Lcom/google/android/gms/internal/lb;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/lb;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ka;

    check-cast p2, Lcom/google/android/gms/internal/ka;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/kd$1;->a(Lcom/google/android/gms/internal/ka;Lcom/google/android/gms/internal/ka;)I

    move-result v0

    return v0
.end method

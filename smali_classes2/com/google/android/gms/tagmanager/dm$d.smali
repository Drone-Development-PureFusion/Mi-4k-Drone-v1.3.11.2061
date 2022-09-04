.class Lcom/google/android/gms/tagmanager/dm$d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/dl$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/tagmanager/dm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/tagmanager/dm;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/tagmanager/dm;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/dm$d;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/tagmanager/dm;Lcom/google/android/gms/tagmanager/dm$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/dm$d;-><init>(Lcom/google/android/gms/tagmanager/dm;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$d;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/dm;->a(Lcom/google/android/gms/tagmanager/dm;)Lcom/google/android/gms/tagmanager/bu;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/bu;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$d;->a:Lcom/google/android/gms/tagmanager/dm;

    const-wide/16 v2, 0x0

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/tagmanager/dm;->a(Lcom/google/android/gms/tagmanager/dm;J)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$d;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tagmanager/dm;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dm$d;->a:Lcom/google/android/gms/tagmanager/dm;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/dm;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

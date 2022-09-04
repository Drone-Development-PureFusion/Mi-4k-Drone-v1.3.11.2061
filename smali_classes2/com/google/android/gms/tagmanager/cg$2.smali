.class Lcom/google/android/gms/tagmanager/cg$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/dj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/tagmanager/cg;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/en$c;Lcom/google/android/gms/tagmanager/e;Lcom/google/android/gms/tagmanager/dr$a;Lcom/google/android/gms/tagmanager/dr$a;Lcom/google/android/gms/tagmanager/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tagmanager/dj$a",
        "<",
        "Ljava/lang/String;",
        "Lcom/google/android/gms/tagmanager/cg$b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/tagmanager/cg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/cg;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/cg$2;->a:Lcom/google/android/gms/tagmanager/cg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lcom/google/android/gms/tagmanager/cg$b;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/tagmanager/cg$2;->a(Ljava/lang/String;Lcom/google/android/gms/tagmanager/cg$b;)I

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;Lcom/google/android/gms/tagmanager/cg$b;)I
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p2}, Lcom/google/android/gms/tagmanager/cg$b;->c()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

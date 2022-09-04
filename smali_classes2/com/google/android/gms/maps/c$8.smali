.class Lcom/google/android/gms/maps/c$8;
.super Lcom/google/android/gms/maps/a/t$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$x;Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/c$x;

.field final synthetic b:Lcom/google/android/gms/maps/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$x;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/c$8;->b:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/google/android/gms/maps/c$8;->a:Lcom/google/android/gms/maps/c$x;

    invoke-direct {p0}, Lcom/google/android/gms/maps/a/t$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/c$8;->a:Lcom/google/android/gms/maps/c$x;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/c$x;->a(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/c/e;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/maps/c$8;->a:Lcom/google/android/gms/maps/c$x;

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-interface {v1, v0}, Lcom/google/android/gms/maps/c$x;->a(Landroid/graphics/Bitmap;)V

    return-void
.end method

.class Lcom/google/android/gms/maps/c$24;
.super Lcom/google/android/gms/maps/a/ar$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/c$s;

.field final synthetic b:Lcom/google/android/gms/maps/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$s;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/c$24;->b:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/google/android/gms/maps/c$24;->a:Lcom/google/android/gms/maps/c$s;

    invoke-direct {p0}, Lcom/google/android/gms/maps/a/ar$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/c$24;->a:Lcom/google/android/gms/maps/c$s;

    invoke-interface {v0}, Lcom/google/android/gms/maps/c$s;->a()Z

    move-result v0

    return v0
.end method

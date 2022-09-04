.class public interface abstract Lcom/google/android/gms/internal/st$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/st;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/internal/st$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/st$a$1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/st$a$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/st$a;->a:Lcom/google/android/gms/internal/st$a;

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/os/Looper;)Landroid/os/Handler;
.end method

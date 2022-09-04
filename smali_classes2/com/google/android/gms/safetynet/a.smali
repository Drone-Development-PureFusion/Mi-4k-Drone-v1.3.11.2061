.class public Lcom/google/android/gms/safetynet/a;
.super Ljava/lang/Object;


# static fields
.field public static final a:I = 0x4

.field public static final b:I = 0x5


# instance fields
.field private c:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/safetynet/a;->c:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/safetynet/a;->c:I

    return v0
.end method
